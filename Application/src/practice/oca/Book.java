package practice.oca;

public class Book {


    // public, private (classdan kenara cixmir HECH BIR HALDA), protected(bahsqa inhertiance olur ve bahsqa packagede dise onda bu istifade elemis olacaq)
    // package protected = default(packegeden kenara cixa bilmir)
    private int rate;

    private String title = "Title"; //access within same package
    public int pageSize;
    public String author;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        if (rate >= 0 && rate <= 5) {
            this.rate = rate;

        } else System.out.println("Rate must be between 0-5");
    }

    public String getTitle() {

        return title;
    }


    public static void main(String[] args) {


    }

}
