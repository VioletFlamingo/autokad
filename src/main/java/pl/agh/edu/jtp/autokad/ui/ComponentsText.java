package pl.agh.edu.jtp.autokad.ui;

import javax.swing.*;
import java.util.ResourceBundle;

/**
 * Created by Paulina on 07.05.2014.
 */
public class ComponentsText {
    public static void setText(ResourceBundle messages) {
        UIManager.put("FileChooser.openDialogTitleText", messages.getString("open"));
        UIManager.put("FileChooser.saveDialogTitleText", messages.getString("save"));
//        UIManager.put("FileChooser.lookInLabelText", "Փնտրել");
//        UIManager.put("FileChooser.saveInLabelText", "Պահել");
//        UIManager.put("FileChooser.upFolderToolTipText", "Մի Մակարդակ Վերև");
//        UIManager.put("FileChooser.homeFolderToolTipText", "Աշխատաէկրան");
//        UIManager.put("FileChooser.newFolderToolTipText", "Ստեղծել Նոր Պանակ");
//        UIManager.put("FileChooser.listViewButtonToolTipText", "Ցուցակ");
//        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Մանրամասներ");
//        UIManager.put("FileChooser.fileNameHeaderText", "Անուն");
//        UIManager.put("FileChooser.fileSizeHeaderText", "Ծավալ");
//        UIManager.put("FileChooser.fileTypeHeaderText", "Տեսակ");
//        UIManager.put("FileChooser.fileDateHeaderText", "Փոփոխման Ամսաթիվ");
//        UIManager.put("FileChooser.fileAttrHeaderText", "Հատկանիշներ");
//        UIManager.put("FileChooser.fileNameLabelText", "Նշոցի Անուն");
//        UIManager.put("FileChooser.filesOfTypeLabelText", "Նշոցների Տեսակներ");
        UIManager.put("FileChooser.openButtonText", messages.getString("open"));
//        UIManager.put("FileChooser.openButtonToolTipText", "Բացել Ընտրված Նշոցը");
        UIManager.put("FileChooser.saveButtonText", messages.getString("save"));
//        UIManager.put("FileChooser.saveButtonToolTipText", "Պահել Ընտրված Նշոցը");
//        UIManager.put("FileChooser.directoryOpenButtonText", "Պահել");
//        UIManager.put("FileChooser.directoryOpenButtonToolTipText", "Պահել Ընտրված Նշոցը");
        UIManager.put("FileChooser.cancelButtonText", messages.getString("cancel"));
//        UIManager.put("FileChooser.cancelButtonToolTipText", "Դադարեցնել Նշոց Ընտրման Երկխոսության Պատուհանը");
//        UIManager.put("FileChooser.newFolderErrorText", "Նոր Պահոցի Ստեղծման Սխալ");
//        UIManager.put("FileChooser.acceptAllFileFilterText", "Բոլոր Նշոցներ");



        UIManager.put("ColorChooser.cancelText", messages.getString("cancel"));
//        ColorChooser.hsbBlueText
//        ColorChooser.hsbBrightnessText
//        ColorChooser.hsbGreenText
//        ColorChooser.hsbHueText
//        ColorChooser.hsbNameText
//        ColorChooser.hsbRedText
//        ColorChooser.hsbSaturationText
//        ColorChooser.okText
//        ColorChooser.previewText
//        ColorChooser.resetText
        UIManager.put("ColorChooser.rgbBlueText", messages.getString("blue"));
        UIManager.put("ColorChooser.rgbGreenText", messages.getString("green"));
        UIManager.put("ColorChooser.rgbRedText", messages.getString("red"));
//        ColorChooser.nameText
//        ColorChooser.swatchesNameText
//        ColorChooser.swatchesRecentText

//        ColorChooser.background
//        ColorChooser.cancelText
//        ColorChooser.font
//        ColorChooser.foreground
//        ColorChooser.hsbBlueText
//        ColorChooser.hsbBrightnessText
//        ColorChooser.hsbDisplayedMnemonicIndex
//        ColorChooser.hsbGreenText
//        ColorChooser.hsbHueText
//        ColorChooser.hsbMnemonic
//        ColorChooser.hsbNameText
//        ColorChooser.hsbRedText
//        ColorChooser.hsbSaturationText
//        ColorChooser.okText
//        ColorChooser.previewText
//        ColorChooser.resetMnemonic
//        ColorChooser.resetText
//        ColorChooser.rgbBlueMnemonic
//        ColorChooser.rgbBlueText
//        ColorChooser.rgbDisplayedMnemonicIndex
//        ColorChooser.rgbGreenMnemonic
//        ColorChooser.rgbGreenText
//        ColorChooser.rgbMnemonic
//        ColorChooser.rgbNameText
//        ColorChooser.rgbRedMnemonic
//        ColorChooser.rgbRedText
//        ColorChooser.sampleText
//        ColorChooser.swatchesDefaultRecentColor
//        ColorChooser.swatchesDisplayedMnemonicIndex
//        ColorChooser.swatchesMnemonic
        UIManager.put("ColorChooser.swatchesNameText", messages.getString("swatches"));
//        ColorChooser.swatchesRecentSwatchSize
        UIManager.put("ColorChooser.swatchesRecentText", messages.getString("recent"));
//        ColorChooser.swatchesSwatchSize
    }
}
