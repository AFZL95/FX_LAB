package TableView;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by FZL on 7/26/2016.
 */

//using the javaFX.beans.property
//it's one of the models for creating objects
public class contact {

        private final SimpleStringProperty firstName = new SimpleStringProperty("");
        private final SimpleStringProperty lastName = new SimpleStringProperty("");
        private final SimpleStringProperty cellPhone= new SimpleStringProperty("");

        public contact() {
            this("", "", "");
        }
        //the main constructor
        public contact(String firstName, String lastName, String cellPhone) {
            setFirstName(firstName);
            setLastName(lastName);
            setCellPhone(cellPhone);
        }

        //get and set methods//

        public String getFirstName() {
            return firstName.get();
        }

        public void setFirstName(String fName) {
            firstName.set(fName);
        }

        public String getLastName() {
            return lastName.get();
        }

        public void setLastName(String fName) {
            lastName.set(fName);
        }

        public String getCellPhone() {
            return cellPhone.get();
        }

        public void setCellPhone(String cell) {
            cellPhone.set(cell);
        }

}
