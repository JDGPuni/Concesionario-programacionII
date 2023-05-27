package com.tucarro.interfaz;

import com.tucarro.model.Administrador;
import com.tucarro.model.Empleado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    //Instancia de administrador
    Administrador admin = new Administrador();

     //Declaramos las ventanas
    @FXML private Tab tabIndex;
    @FXML private Tab tabReportes;
    @FXML private Tab tabGestionar;

    //Declarar los textfields
    @FXML private TextField txtBuscar;
    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    @FXML private TextField txtCedula;
    @FXML private TextField txtEmail;
    @FXML private PasswordField txtContraseña;

    //Declarar los choicebox
    @FXML private ChoiceBox<String> estado;

    //Declarar los botones
    @FXML
    private Button btnRegistrar, btnActualizar, btnEliminar, btnLimpiar, btnBuscar;

    //Declarar la tabla
    @FXML private TableView<Empleado> tblEmpleados;

    //Declarar las columnas de la tabla
    @FXML private TableColumn colNombre, colApellido, colCedula, colEmail, colContraseña, colEstado;

    private ObservableList<Empleado> empleados = FXCollections.observableArrayList();
    private int posicionPersonaEnTabla;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        estado.getItems().addAll("Activo", "Bloqueado");   //Agrega valores al ChoiceBox

        //Asocia el objeto a su columna correspondiente.
        colNombre.setCellValueFactory(new PropertyValueFactory<Empleado, String>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<Empleado, String>("apellido"));
        colCedula.setCellValueFactory(new PropertyValueFactory<Empleado, String>("cedula"));
        colEmail.setCellValueFactory(new PropertyValueFactory<Empleado, String>("email"));
        colContraseña.setCellValueFactory(new PropertyValueFactory<Empleado, String>("contraseña"));
        colEstado.setCellValueFactory(new PropertyValueFactory<Empleado, String>("estado"));
    }

    @FXML
    public void buscar(ActionEvent event){
        String cedula = txtBuscar.getText();

        for (int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getCedula().equals(cedula)){
                txtNombre.setText(empleados.get(i).getNombre());
                txtApellido.setText(empleados.get(i).getApellido());
                txtCedula.setText(empleados.get(i).getCedula());
                txtEmail.setText(empleados.get(i).getEmail());
                txtContraseña.setText(empleados.get(i).getContraseña());
            }else{
                JOptionPane.showMessageDialog(null, "El usuario ingresado no existe, por favor verifique", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

            }
        }
    }

    @FXML
    public void limpiar(){
        //Limpia los campos para realizar un nuevo registro
        txtBuscar.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtEmail.setText("");
        txtContraseña.setText("");
        estado.setValue("");

        //permite que solo el boton de registrar se active
        btnActualizar.setDisable(true);
        btnEliminar.setDisable(true);
        btnRegistrar.setDisable(false);
    }
    @FXML
    public void registrar(ActionEvent event){
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cedula = txtCedula.getText();
        String email = txtEmail.getText();
        String contraseña = txtContraseña.getText();
        String estadoUsuario = estado.getSelectionModel().getSelectedItem();

        boolean registro = admin.registrarEmpleado(nombre, apellido, cedula, email, contraseña);
        Empleado empleado = new Empleado(nombre, apellido, cedula, email, contraseña);

        if (!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtCedula.getText().isEmpty() && !txtEmail.getText().isEmpty() && !txtContraseña.getText().isEmpty() && !estado.getItems().isEmpty()) {     //Condición que valida si los campos de textos están vacios.
            if(registro == true){

                //empleados.add(empleado);
                    JOptionPane.showMessageDialog(null, "Usuario registrado con éxito.");
                    tblEmpleados.setItems(empleados);
                    tblEmpleados.refresh();
                    btnActualizar.setDisable(false);
                    btnEliminar.setDisable(false);

            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un usuario con estos datos.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Porfavor rellene todos los campos", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }

    @FXML
    public void actualizar(ActionEvent event){
        Empleado em = tblEmpleados.getSelectionModel().getSelectedItem();    //Devuelve el empleado que se ha seleccionado

        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cedula = txtBuscar.getText();
        String email = txtEmail.getText();
        String contraseña = txtContraseña.getText();
        String estadoEmpleado = estado.getValue();

        boolean registrado = admin.actualizarDatosEmpleado(nombre, apellido, cedula, email, contraseña);

        if(registrado == true){
                tblEmpleados.refresh();
                JOptionPane.showMessageDialog(null, "Datos actualizados exitosamente");
        }else{
            JOptionPane.showMessageDialog(null, "El usuario no se ha encrontrado", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }

    @FXML
    public void eliminar(ActionEvent event){

        String cedula = txtBuscar.getText();
        boolean eliminado = admin.eliminarEmpleado(cedula);

        if(eliminado == true){
            JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente");
        }else{
            JOptionPane.showMessageDialog(null, "El usuario no se ha podido eliminar, vuelve a intentarlo", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }
}
