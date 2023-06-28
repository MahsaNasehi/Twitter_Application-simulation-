package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import model.common.Countries;
import model.common.ResponseOrErrorType;
import model.common.User;
import model.common.Validate;
import model.javafx_action.JavaFXImpl;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.zip.InflaterInputStream;

public class EditProfController implements Initializable {
    private Socket socket;
    private ObjectOutputStream writer;
    private String jwt;
    private User user;
    private EditProfController editProfileController;

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public void setWriter(ObjectOutputStream writer) {
        this.writer = writer;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserProfController(EditProfController controller){
        this.editProfileController = controller;
    }
    @FXML
    private Label Name_Lbl;

    @FXML
    private Button Save_Btn;

    @FXML
    private Label Username_Lbl;

    @FXML
    private TextField bio_txt;

    @FXML
    private ToggleGroup birthdate_choices;

    @FXML
    private ChoiceBox<String> chiceBox;

    @FXML
    private Circle circle_prof;
    @FXML
    private ImageView header_imgview;

    @FXML
    private Label day_lbl;

    @FXML
    private Label email_lbl;

    @FXML
    private TextField link_txt;


    @FXML
    private Button Back_btn;
    @FXML
    private TextField profilePath_txt;
    @FXML
    private TextField loca_txt;

    @FXML
    private TextField headerPath_txt;

    @FXML
    private Label month_lbl;

    @FXML
    private RadioButton nope_birth;

    @FXML
    private RadioButton nope_reg;
    @FXML
    private RadioButton nope_loc;

    @FXML
    private RadioButton yep_loc;

    @FXML
    private Label phonenumber_lbl;
    @FXML
    private Label alert_Lbl;

    @FXML
    private ToggleGroup reg_choices;
    @FXML
    private Button deleteHeader_btn;

    @FXML
    private Button dlt_avatar_btn;
    @FXML
    private Button dlt_bio_btn;

    @FXML
    private Button dlt_link_btn;
    @FXML
    private Label region_lbl;

    @FXML
    private Label year_lbl;

    @FXML
    private RadioButton yep_birth;

    @FXML
    private RadioButton yep_reg;

    @FXML
    void EditBirthdate(MouseEvent event) {
//        String year = null, month = null, day = null;
//        boolean isAllowedToEdit = true;
//        try {
//            year = year_lbl.getText();
//            month = month_lbl.getText();
//            day = day_lbl.getText();
//        }catch (NullPointerException e){
//            // TODO show alert label that date shouldn't be empty
//            isAllowedToEdit = false;
//        }
//        StringBuilder birthdateSB = new StringBuilder();
//        birthdateSB.append(year);
//        birthdateSB.append("/");
//        birthdateSB.append(month);
//        birthdateSB.append("/");
//        birthdateSB.append(day);
//        Date birthdate =null;
//        if(!Validate.NotBlank(day, month, year)){
//            // TODO show alert label that date shouldn't be empty
//            isAllowedToEdit = false;
//        }else if(Validate.validateDateFormat(birthdateSB.toString()) != ResponseOrErrorType.SUCCESSFUL) {
//            // TODO show alert label that date should be valid
//            isAllowedToEdit = false;
//        }
//        try {
//            birthdate = new Date(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
//        } catch (Exception e){
//            isAllowedToEdit =false;
//        }
//        if (isAllowedToEdit){
//            user.setBirthDate(birthdate);
//        }
    }

    @FXML
    void EditEmail(MouseEvent event) {
//        String email = null;
//        boolean isAllowedToEdit = true;
//        try {
//            email = email_lbl.getText();
//        }catch (NullPointerException e){
//            // TODO show alert label that date shouldn't be empty
//            isAllowedToEdit = false;
//        }
//        if (isAllowedToEdit){
//            user.setEmail(email);
//        }
    }

    @FXML
    void EditPhone(MouseEvent event) {
//        String phone = null;
//        boolean isAllowedToEdit = true;
//        try {
//            phone = phonenumber_lbl.getText();
//        }catch (NullPointerException e){
//            // TODO show alert label that date shouldn't be empty
//            isAllowedToEdit = false;
//        }
//        if (isAllowedToEdit){
//            user.setPhoneNumber(phone);
//        }
    }

    @FXML
    void EditRegion(MouseEvent event) {
//        String region = null;
//        boolean isAllowedToEdit = true;
//        try {
//            region = chiceBox.getValue();
//        }catch (NullPointerException e){
//            // TODO show alert label that date shouldn't be empty
//            isAllowedToEdit = false;
//        }
//        if (isAllowedToEdit){
//            user.setLocation(region); // TODO Region is incomplete
//        }
    }

    @FXML
    void editName(MouseEvent event) {
//        String name = null;
//        boolean isAllowedToEdit = true;
//        try {
//            name = Name_Lbl.getText();
//        }catch (NullPointerException e){
//            // TODO show alert label that date shouldn't be empty
//            isAllowedToEdit = false;
//        }
//        if (isAllowedToEdit){
//            user.setPhoneNumber(name);
//        }
    }

    @FXML
    void editProfilePhoto(MouseEvent event) {
//        String path = null;
//        boolean isAllowedToEdit = true;
//        try {
//            path = profilePath_txt.getText();
//        }catch (NullPointerException e){
//            // TODO show alert label that date shouldn't be empty
//            isAllowedToEdit = false;
//        }
//        if (isAllowedToEdit){
//            user.setAvatar(path);
//        }
    }

    @FXML
    void editUsername(MouseEvent event) {
//        String username = null;
//        boolean isAllowedToEdit = true;
//        try {
//            username = Username_Lbl.getText();
//        }catch (NullPointerException e){
//            // TODO show alert label that date shouldn't be empty
//            isAllowedToEdit = false;
//        }
//        if (isAllowedToEdit){
//            user.setUsername(username);
//        }
    }

    @FXML
    void deleteAvatar(ActionEvent event) {
        Image image = new Image("images\\download2.png");
        circle_prof.setFill(new ImagePattern(image));
        user.setAvatar(null);
    }

    @FXML
    void deleteHeader(ActionEvent event) {
//        Image image = new Image("images\\R6wDve.jpg");
//        header_imgview.setImage(image);
        header_imgview.setImage(null); // TODO doubtful
        user.setHeader(null);
    }
    @FXML
    void deleteBio(ActionEvent event) {
        bio_txt.setText("");
        user.setBio(null);
    }
    @FXML
    void deleteLink(ActionEvent event) {
        link_txt.setText("");
        //TODO
    }
    @FXML
    void GoBack(ActionEvent event) {
        TwitterApplication.goBack((Stage) ((Node) event.getSource()).getScene().getWindow());
    }
    @FXML
    void saveProfile(ActionEvent event) {
        String name = null;
        boolean isAllowedToEdit = true;
        try {
            name = Name_Lbl.getText();
            user.setPhoneNumber(name);
        }catch (NullPointerException e){
            alert_Lbl.setText("*Alert* :" + "enter name");
            isAllowedToEdit = false;
        }


        String username = null;
        try {
            username = Username_Lbl.getText();
            user.setUsername(username);
        }catch (NullPointerException e){
            alert_Lbl.setText(alert_Lbl.getText() + "\n" + "*Alert* :" + "enter username");
            isAllowedToEdit = false;
        }

        String path = null;
        try {
            path = profilePath_txt.getText();
            user.setAvatar(path);
        }catch (NullPointerException ignored){
        }

        String headerPath = null;
        try {
            headerPath = headerPath_txt.getText();
            user.setHeader(headerPath);
        }catch (NullPointerException ignored){
        }


        String email = null;
        try {
            email = email_lbl.getText();
            user.setEmail(email);
        }catch (NullPointerException e){
            alert_Lbl.setText(alert_Lbl.getText() + "\n" + "*Alert* :" + "enter email");
            isAllowedToEdit = false;
        }

        String phone = null;
        try {
            phone = phonenumber_lbl.getText();
            user.setPhoneNumber(phone);
        }catch (NullPointerException e){
            alert_Lbl.setText(alert_Lbl.getText() + "\n" + "*Alert* :" + "enter phone-number");
            isAllowedToEdit = false;
        }

        String region = null;
        try {
            region = chiceBox.getValue();
            user.setLocation(region); // TODO Region is incomplete
        }catch (NullPointerException e){
            alert_Lbl.setText(alert_Lbl.getText() + "\n" + "*Alert* :" + "choose the country");
            isAllowedToEdit = false;
        }

        String year = null, month = null, day = null;
        try {
            year = year_lbl.getText();
            month = month_lbl.getText();
            day = day_lbl.getText();
        }catch (NullPointerException e){
            alert_Lbl.setText(alert_Lbl.getText() + "\n" + "*Alert* :" + "enter birthdate");
            isAllowedToEdit = false;
        }
        StringBuilder birthdateSB = new StringBuilder();
        birthdateSB.append(year);
        birthdateSB.append("/");
        birthdateSB.append(month);
        birthdateSB.append("/");
        birthdateSB.append(day);
        Date birthdate =null;
        if(!Validate.NotBlank(day, month, year)){
            alert_Lbl.setText(alert_Lbl.getText() + "\n" + "*Alert* :" + "enter birthdate");
            isAllowedToEdit = false;
        }else if(Validate.validateDateFormat(birthdateSB.toString()) != ResponseOrErrorType.SUCCESSFUL) {
            alert_Lbl.setText(alert_Lbl.getText() + "\n" + "*Alert* :" + "invalid birthdate format");
            isAllowedToEdit = false;
        }
        try {
            birthdate = new SimpleDateFormat("yyyy/MM/dd").parse(birthdateSB.toString());
            user.setBirthDate(birthdate);
        } catch (Exception e){
            isAllowedToEdit =false;
        }


        String bio = null;
        try {
            bio = bio_txt.getText();
            user.setBio(bio);
        }catch (NullPointerException ignored){
        }

        String link = null;
        try {
            link = link_txt.getText();
//            user.setPhoneNumber(phone); TODO
        }catch (NullPointerException ignored){
        }


        if(yep_loc.isSelected()){
            user.setToShowLocInProf(true);
        }else if (nope_loc.isSelected()){
            user.setToShowLocInProf(false);
        }

        if(yep_birth.isSelected()){
            user.setToShowBirthInProf(true);
        }else if (nope_birth.isSelected()){
            user.setToShowBirthInProf(false);
        }

        if(yep_reg.isSelected()){
            user.setToShowRegInProf(true);
        }else if (nope_reg.isSelected()){
            user.setToShowRegInProf(false);
        }
        Thread threadTask = new Thread(new Runnable() {

            @Override
        public void run() {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    alert_Lbl.setText("");
                }
            });
        }
    });
        threadTask.start();
        if (isAllowedToEdit){
            //TODO
            JavaFXImpl.changeProf(user, socket, writer, jwt);
        }
    }
    public void prepareProf() {
        setUsername_Lbl("@" + user.getUsername());
        setName_Lbl(user.getFirstName() + " " + user.getLastName());
        setBio_labl(user.getBio());
        setLocation_Labl(user.getLocation());
        setCircle_prof(user.getAvatar());
        setEmail_lbl(user.getEmail());
        setPhonenumber_lbl(user.getPhoneNumber());
        setBirthdate_Labl(user.getBirthDate());
        setHeader_prof(user.getHeader());
    }


    public void setBio_labl(String bio_labl) {
        bio_txt.setText(bio_labl);
    }

    public void setBirthdate_Labl(Date birthdate_Labl) {
        String parts[] = birthdate_Labl.toString().split("-");
        year_lbl.setText(parts[0]);
        month_lbl.setText(parts[1]);
        day_lbl.setText(parts[2]);
    }


//  TODO  public void setLink_hyper(Hyperlink link_hyper) {
//        Link_hyper = link_hyper;
//    }

    public void setLocation_Labl(String location_Labl) {
            region_lbl.setText(location_Labl);
            chiceBox.setValue(location_Labl);
    }


    public void setName_Lbl(String name_Lbl) {
        Name_Lbl.setText(name_Lbl);
    }

    public void setUsername_Lbl(String  username_Lbl) {
        Username_Lbl.setText(username_Lbl);
    }
    public void setEmail_lbl(String email) {
        email_lbl.setText(email);
    }
    public void setPhonenumber_lbl(String phonenumberLbl) {
        phonenumber_lbl.setText(phonenumberLbl);
    }


    public void setCircle_prof(String profUrl) {
        if (Validate.NotBlank(profUrl)){
            Image prof = new Image(profUrl);
            circle_prof.setFill(new ImagePattern(prof));
        }

    }
    public void setHeader_prof(String profUrl) {
        if (Validate.NotBlank(profUrl)){
            Image prof = new Image(profUrl);
            header_imgview.setImage(prof);
        }

    }
    public void  addLabel(String errorMsg){
        alert_Lbl.setText(errorMsg);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        chiceBox.getItems().addAll(Countries.countries);
    }
}