
class InvalidException extends Exception{
    public InvalidException(String msg){
        super(msg);
    }
}

class CustomExceptionHandling{
    public static void main(String[] args){
        int age = 15;

        try{
            if(age < 18){
            throw new InvalidException("below age");
        }
        }catch(InvalidException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.print("Exception : " + e);
        }
    }
}