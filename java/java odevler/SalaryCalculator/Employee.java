public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
  
    public Employee(String name, int salary, int workHours, int hireYear) {
      this.name = name;
      this.salary = salary;
      this.workHours = workHours;
      this.hireYear = hireYear;
    }
  
    public double tax() {
      return salary < 1000 ? 0 : salary * 0.03;
    }
  
    public int bonus() {
      return workHours <= 40 ? 0 : (workHours - 40) * 30;
    }
  
    public double raiseSalary() {
      return hireYear < 10 ? salary * 0.05 : hireYear < 20 ? salary * 0.1 : salary * 0.15;
    }
  
    public String toString() {
      double tax = tax();
      int bonus = bonus();
      double raise = raiseSalary();
  
      System.out.println("Adı : " + name);
      System.out.println("Maaşı : " + salary);
      System.out.println("Çalışma Saati : " + workHours);
      System.out.println("Başlangıç Yılı : " + hireYear);
      System.out.println("Vergi : " + tax);
      System.out.println("Bonus : " + bonus);
      System.out.println("Maaş Artışı : " + raise);
      System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (salary + bonus - tax));
      System.out.println("Toplam Maaş : " + (salary + raise));
      return "";
    }
  }