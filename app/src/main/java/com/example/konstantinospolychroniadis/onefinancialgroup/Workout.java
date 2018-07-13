package com.example.konstantinospolychroniadis.onefinancialgroup;

public class Workout {

    private String name;
    private String description;
    private String amount;
    private String holder;
    private String help;

    public static final Workout[] workouts={
            new Workout("Primary Account", "Account Number: 20-45-34 567239875", "Current Balance: £ 4,267.97", "Main Holder: KSI Ltd", "Representative: Joana Smith"),
            new Workout("Savings Account", "Account Number: 23-45-22 561923450", "Current Balance: £ 9,845.42", "Main Holder: KSI Ltd", "Representative: Keila Willis"),
            new Workout("Investment Account", "Account Number: 29-65-12 567483945", "Current Balance: £ 8,967.12", "Main Holder: KSI Ltd", "Representative: John Mayn")
    };

    private Workout(String name, String description, String amount, String holder, String help) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.holder = holder;
        this.help = help;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAmount(){
        return amount;
    }

    public String getHolder(){
        return holder;
    }

    public String getHelp(){
        return help;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
