class User {
    private String customer_name,customer_gender,customer_flight_no,customer_from,customer_to,customer_ticket_class,customer_departer_date;
    private int customer_id,customer_age,customer_adults,customer_childs,customer_seat_no;
    
    User(int customer_id,String customer_name,int customer_age,int customer_adults,int customer_childs,String customer_gender,int customer_seat_no,String customer_flight_no,String customer_from,String customer_to,String customer_ticket_class,String customer_departer_date){
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_age = customer_age;
        this.customer_adults = customer_adults;
        this.customer_childs = customer_childs;
        this.customer_gender = customer_gender;
        this.customer_seat_no = customer_seat_no;
        this.customer_flight_no = customer_flight_no;
        this.customer_from = customer_from;
        this.customer_to = customer_to;
        this.customer_ticket_class = customer_ticket_class;
        this.customer_departer_date = customer_departer_date;
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getCustomer_id(){
        return customer_id;
    }
    public String getCustomer_name(){
        return customer_name;
    }
    public int getCustomer_age(){
        return customer_age;
    }
    public int getCustomer_adults(){
        return customer_adults;
    }
    public int getCustomer_childs(){
        return customer_childs;
    }
    public String getCustomer_gender(){
        return customer_gender;
    }
    public int getCustomer_seat_no(){
        return customer_seat_no;
    }
    public String getCustomer_flight_no(){
        return customer_flight_no;
    }
    public String getCustomer_from(){
        return customer_from;
    }
    public String getCustomer_to(){
        return customer_to;
    }
    public String getCustomer_ticket_class(){
        return customer_ticket_class;
    }
    public String getCustomer_departer_date(){
        return customer_departer_date;
    }
    
    
}
    
