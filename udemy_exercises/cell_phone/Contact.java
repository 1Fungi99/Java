package udemy_exercises.cell_phone;

class Contact {
    private String name;
    private String num;

    //Constructor
    public Contact(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public static Contact createContact(String name, String num) {
        return new Contact(name, num);
    }
}

/*
    - **Contact Class:**
        - Name
        - Phone number
*/
