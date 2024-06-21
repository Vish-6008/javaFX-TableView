package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable{
	@FXML private TableView<Student>table;
	@FXML private TableColumn<Student,Integer>id;
	@FXML private TableColumn<Student,String>name;
	@FXML private TableColumn<Student,String>Surname;
	@FXML private TableColumn<Student,Integer>age;
	
	public  ObservableList<Student> list= FXCollections.observableArrayList(
			new Student(1,"Vishwa","Dematti",401),
			new Student(2,"Vrushabh","Shindhe",402),
			new Student(3,"Abhishek","patil",403),
			new Student(4,"Niranjan","upari",404),
			new Student(5,"Amrut","kesappanatti",405)
			);
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		id.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
		Surname.setCellValueFactory(new PropertyValueFactory<Student,String>("Surname"));
		age.setCellValueFactory(new PropertyValueFactory<Student,Integer>("age"));
		table.setItems(list);
		// TODO Auto-generated method stub
		
	}

}
