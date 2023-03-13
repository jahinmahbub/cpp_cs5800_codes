public class driver {
    public static void main(String[] args) {
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        BaseEmployee renwa = new BaseEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        SalariedEmployee mike = new SalariedEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);
        
        System.out.println(joe.getFirstName() + " " + joe.getLastName() + " " + joe.getSocialSecurityNumber() + " " + joe.getWeeklySalary());
        System.out.println(stephanie.getFirstName() + " " + stephanie.getLastName() + " " + stephanie.getSocialSecurityNumber() + " " + stephanie.getWage() + " " + stephanie.getHoursWorked());
        System.out.println(mary.getFirstName() + " " + mary.getLastName() + " " + mary.getSocialSecurityNumber() + " " + mary.getWage() + " " + mary.getHoursWorked());
        System.out.println(nicole.getFirstName() + " " + nicole.getLastName() + " " + nicole.getSocialSecurityNumber() + " " + nicole.getCommissionRate() + " " + nicole.getGrossSales());
        System.out.println(renwa.getFirstName() + " " + renwa.getLastName() + " " + renwa.getSocialSecurityNumber() + " " + renwa.getBaseSalary());
        System.out.println(mike.getFirstName() + " " + mike.getLastName() + " " + mike.getSocialSecurityNumber() + " " + mike.getWeeklySalary());
        System.out.println(mahnaz.getFirstName() + " " + mahnaz.getLastName() + " " + mahnaz.getSocialSecurityNumber() + " " + mahnaz.getCommissionRate() + " " + mahnaz.getGrossSales());
    }
}
