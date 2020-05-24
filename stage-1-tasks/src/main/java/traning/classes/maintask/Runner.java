/*2. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
        Создать массив объектов. Вывести:
        a) список покупателей в алфавитном порядке;
        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.*/

package traning.classes.maintask;

public class Runner {
    public static void main(String[] args) {

        Customer[] customers = new Customer[6];

        customers[2] = new Customer(1, "Ivanov Ivan Ivanovich", "Sovetskaya 6", 1334, 1122330000);
        customers[0] = new Customer(6, "Yuryev Yury Yuryvich", "Sovetskaya 6", 2568, 1123350000);
        customers[1] = new Customer(2, "Petrov Petr Petrovich", "Sadovaya 3", 3781, 1133440000);
        customers[4] = new Customer(3, "Sidorov Sergey Sergeevich", "Sadovaya 8", 4693, 1144550000);
        customers[3] = new Customer(4, "Alexandronetc Alexandr Alaxandrovich", "Gagarina 3", 5004, 1155440000);
        customers[5] = new Customer(5, "Ilyk Ilya Ilyich", "Sadovaya 3", 6020, 1155660000);

        Service service = new Service();
        service.displayTheListOfCustomersByAssignedRange(customers);
        service.sortTheListOfCustomersByName(customers);
    }
}
