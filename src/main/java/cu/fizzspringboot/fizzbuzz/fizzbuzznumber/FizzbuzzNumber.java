package cu.fizzspringboot.fizzbuzz.fizzbuzznumber;

public class FizzbuzzNumber{
    private int id;
    private String result;

    public FizzbuzzNumber(){
        this.id = 1;
    }

    public FizzbuzzNumber(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getResult(){
        return CalcFizz(id);
    }

    public void setId(int id){
        this.id = id;
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
                "id="+id+
                ", result='"+this.getResult()+'\''+
                '}';
    } 
} 