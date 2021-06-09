package cu.fizzspringboot.fizzbuzz.fizzbuzznumber;

public class FizzbuzzNumber{
    private int number;
    private String result;

    public FizzbuzzNumber(){
        this.number = 1;
    }

    public FizzbuzzNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public String getResult(){
        return CalcFizz(number);
    }

    public void setNumber(int number){
        this.number = number;
    }

    private void setResult(String result){
        //not allowed
        //this.result = result;
    }

    public String CalcFizz(int number)
	{
		if (number%15 == 0)
			return "Fizzbuzz";
		else if (number%3 == 0)
			return "Fizz";
		else if (number%5 == 0)
			return "Buzz";
		else
			return number+"";
	}

    @Override
    public String toString(){
        return  "FizzbuzzNumber{"+
                "number="+number+
                ", result='"+this.getResult()+'\''+
                '}';
    } 
} 