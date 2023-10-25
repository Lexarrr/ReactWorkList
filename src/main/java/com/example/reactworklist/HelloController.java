package com.example.reactworklist;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class HelloController {

    @FXML
    TextField nom, name, surname, post, age, we, salary;

    @FXML
    TableView<ObservWorker> wTV;

    ObservableList<ObservWorker> ow = FXCollections.observableArrayList();

    @FXML
    protected void toAddNewWorker() {
//        int id = Integer.parseInt(nom.getText());
        int yo = Integer.parseInt(age.getText());
        int exp = Integer.parseInt(we.getText());
        double sal = Double.parseDouble(salary.getText());


        ObservWorker observWorker = new ObservWorker(name.getText(), surname.getText(), post.getText(), yo, exp, sal);
        ow.add(observWorker);
//        observWorker.name.addListener((observableValue, s, t1) ->  );
    }

    public void initialize(){
        ow.addListener((ListChangeListener<ObservWorker>) change -> {
            while (change.next())  {
                if(change.wasAdded()){
                    System.out.println("что-то добавилось в список");
                    for(ObservWorker obsWork: change.getAddedSubList()) {
//                        paintCar(ow);
                    }
                }
                if(change.wasRemoved())  {
                    System.out.println("что-то удалилось из списка");
                    for(ObservWorker obsWor: change.getRemoved()) {
//                        eraseCar(oc);
                    }
                }
            }
        });

//        initTable();
    }

    protected void toShowView(){
        wTV.getColumns().clear();


    }


    private void paintCar(ObservWorker owr) {
        //Label lab = new Label(pc.toString());
        TextField fname = new TextField();
        fname.textProperty().bindBidirectional(owr.name);

        TextField sname = new TextField();
        sname.textProperty().bindBidirectional(owr.surname);

        TextField posit = new TextField();
        posit.textProperty().bindBidirectional(owr.position);

        TextField yearOld = new TextField();
        yearOld.textProperty().bindBidirectional(owr.ageProperty(), new DecimalFormat());

        TextField workExp = new TextField();
        workExp.textProperty().bindBidirectional(owr.workExpProperty(), new DecimalFormat());

        TextField sala = new TextField();
        sala.textProperty().bindBidirectional(owr.salaryProperty(), new DecimalFormat());


        Button but = new Button("act");
        but.setOnAction(q-> ow.remove(owr));

    }
//
//    private void eraseCar(ObservableCar oc) {
//        boxForCars.getChildren().remove(hBoxMap3.get(oc));
//        hBoxMap3.remove(oc);
//    }

}