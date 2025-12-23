package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.BusTicket;

public class DashboardController {

    @FXML private TableView<BusTicket> table;
    @FXML private TableColumn<BusTicket, String> busCol;
    @FXML private TableColumn<BusTicket, String> dateCol;
    @FXML private TableColumn<BusTicket, String> timeCol;
    @FXML private TableColumn<BusTicket, Double> priceCol;

    public static ObservableList<BusTicket> ticketList =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        busCol.setCellValueFactory(new PropertyValueFactory<>("busName"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        table.setItems(ticketList);
    }

    @FXML
    void goAddTicket() throws Exception {
        Stage stage = (Stage) table.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("/add_ticket.fxml"))
        ));
    }

    @FXML
    void confirmTicket() throws Exception {
        Stage stage = (Stage) table.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("/confirm.fxml"))
        ));
    }
}


