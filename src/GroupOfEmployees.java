import java.sql.SQLOutput;
import java.util.Arrays;

public class GroupOfEmployees {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Vasilij", "Pupkin", "Gardener", "vasja@domain.com", "+111 3456789", 30000, 64);
        emplArray[1] = new Employee("Viktor", "Afonasjev", "Engineer", "viktor@domain.com", "+122 4335532", 60000, 44);
        emplArray[2] = new Employee("Anna", "Kudrina", "Assistant", "anna@domain.com", "+155 6565656", 25000, 20);
        emplArray[3] = new Employee("Dmitrij", "Demidov", "Director", "dmitrij@domain.com", "+341 45663323", 300000, 41);
        emplArray[4] = new Employee("Norma", "Baker", "Artist", "norma@domain.com", "+143 34665649", 50000, 25);

        for (int i=0; i< emplArray.length; i++) {
            if (emplArray[i].age > 40) {
                emplArray[i].printEmployee();
            }
        }
    }
}
