public interface Person {
    /*
     * chairType can be 'hard' or 'soft'
     */
    public void sit(String chairType);

    /*
     * cry should return one of {loud, soft}
     */
    public String cry();

    /*
     * eat should return the type of food.
     */
    public String eat();

    /*
     * sleep should return the hours of sleep
     */
    public int sleep();  

    public void setCry(String typeOfCry);
}
