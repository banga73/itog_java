public class PrintPhoneBook {
    public static void main(String[] args) {
        String name0;
        String name1;
        String name2;
        String name3;
        String name4;
        int phone0;
        int phone1;
        int phone2;
        int phone3;
        int phone4;

        if (args.length == 0) {
            name0 = "Januarev";
            name1 = "Februarev";
            name2 = "Martov";
            name3 = "Aprelev";
            name4 = "Mayev";

            phone0 = 1234567;
            phone1 = 2345678;
            phone2 = 3456789;
            phone3 = 4567890;
            phone4 = 5678912;

        } else {
            name0 = args[0];
            name1 = args[1];
            name2 = args[2];
            name3 = args[3];
            name4 = args[4];

            phone0 = Integer.parseInt(args[2]);
            phone1 = Integer.parseInt(args[3]);
            phone2 = Integer.parseInt(args[4]);
            phone3 = Integer.parseInt(args[5]);
            phone4 = Integer.parseInt(args[6]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name0, phone0);
        myPhoneBook.add(name1, phone0);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name2, phone3);
        myPhoneBook.add(name3, phone3);
        myPhoneBook.add(name3, phone4);
        myPhoneBook.add(name4, phone4);
        myPhoneBook.add(name4, phone0);
        myPhoneBook.add(name3, phone1);

        System.out.println("PhoneNumbers for " + name3 +": " + myPhoneBook.find(name3));
        System.out.println();
        PhoneBook.getPhoneBook();
        System.out.println();
        System.out.println("PhoneNumbers for " + "NoName" + ": "+ myPhoneBook.find("NoName"));
    }

}
