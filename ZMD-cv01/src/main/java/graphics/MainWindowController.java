package graphics;

import core.FileBindings;
import enums.SamplingType;
import enums.TransformType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//import javafx.event.ActionEvent;


public class MainWindowController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        samplingType.getItems().addAll(SamplingType.values());
        transformType.getItems().addAll(TransformType.values());

        samplingType.getSelectionModel().select(SamplingType.S_4_4_4);
        transformType.getSelectionModel().select(TransformType.DCT);
    }


    @FXML
    private Button BlueButton1;

    @FXML
    private Button BlueButton2;

    @FXML
    private Button CbButton1;

    @FXML
    private Button CbButton2;

    @FXML
    private Button CountButton;

    @FXML
    private Button CrButton1;

    @FXML
    private Button CrButton2;

    @FXML
    private Button DownSampleButton;

    @FXML
    private CheckBox GrayScaleRadio;

    @FXML
    private Button GreenButton1;

    @FXML
    private Button GreenButton2;

    @FXML
    private Button IQuantizeButton;

    @FXML
    private Button ITransformButton;

    @FXML
    private Button OQRGBButton;

    @FXML
    private Button OverSampleButton;

    @FXML
    private Button QuantizeButton;

    @FXML
    private Button RGBButton;

    @FXML
    private Button RedButton1;

    @FXML
    private Button RedButton2;

    @FXML
    private Button showImage;

    @FXML
    private CheckBox ShowStepsRadio;

    @FXML
    private Button TransformButton;

    @FXML
    private Button YButton1;

    @FXML
    private Button YButton2;

    @FXML
    private Button YCbCrButton;

    @FXML
    private Slider quantizeQuality;

    @FXML
    private TextField quantizeQualityField;

    @FXML
    private ComboBox<SamplingType> samplingType;

    @FXML
    private ComboBox<TransformType> transformType;

    @FXML
    private Spinner<?> transformBlock;

   /* @FXML
    void BlueButton1(ActionEvent event) {

    }

    @FXML
    void BlueButton2(ActionEvent event) {

    }

    @FXML
    void CbButton1(ActionEvent event) {

    }

    @FXML
    void CbButton2(ActionEvent event) {

    }

    @FXML
    void CountButton(ActionEvent event) {

    }

    @FXML
    void CrButton1(ActionEvent event) {

    }

    @FXML
    void CrButton2(ActionEvent event) {

    }

    @FXML
    void DownSampleButton(ActionEvent event) {

    }

    @FXML
    void GrayScaleRadio(ActionEvent event) {

    }

    @FXML
    void GreenButton1(ActionEvent event) {

    }

    @FXML
    void GreenButton2(ActionEvent event) {

    }

    @FXML
    void IQuantizeButton(ActionEvent event) {

    }

    @FXML
    void ITransformButton(ActionEvent event) {

    }

    @FXML
    void OQRGBButton(ActionEvent event) {

    }

    @FXML
    void OverSampleButton(ActionEvent event) {

    }

    @FXML
    void QuantizeButton(ActionEvent event) {

    }

    @FXML
    void RGBButton(ActionEvent event) {

    }

    @FXML
    void RedButton1(ActionEvent event) {

    }

    @FXML
    void RedButton2(ActionEvent event) {

    }*/

    @FXML
    void ShowImage(ActionEvent event){
        File file = new File(FileBindings.defaultImage);

        try {
            Dialogs.showImageInWindow(ImageIO.read(file), "Original", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

   /*@FXML
    void ShowStepsRadio(ActionEvent event) {

    }

    @FXML
    void TransformButton(ActionEvent event) {

    }

    @FXML
    void YButton1(ActionEvent event) {

    }

    @FXML
    void YButton2(ActionEvent event) {

    }

    @FXML
    void YCbCrButton(ActionEvent event) {

    }*/

}
