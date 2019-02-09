public class Elevator {

    private int powerConsumption;
    private String manufacturerName;
    private int maxLoadWeight;

    private String fireSecurity;
    private String elevatorType;

    private static int numberOfCompleteElevators;

    protected String modelName;
    protected String timeOfExploitation;





    public Elevator(String mFireSecurity,int mMaxLoadWeight, int mPowerConsumption, String mManufacturerName){
        fireSecurity=mFireSecurity;
        powerConsumption=mPowerConsumption;
        manufacturerName=mManufacturerName;
        maxLoadWeight=mMaxLoadWeight;

    }

    public Elevator(){

    }
    public Elevator(String mFireSecurity,int mMaxLoadWeight, int mPowerConsumption, String mManufacturerName,
                    String mModelName,String mElevatorType, String mTimeOfExploitation ){
        this(mFireSecurity,mMaxLoadWeight,mPowerConsumption,mManufacturerName);
        modelName=mModelName;
        elevatorType=mElevatorType;
        timeOfExploitation=mTimeOfExploitation;
        numberOfCompleteElevators++;

    }
    public String toString(){
        return "Info about this Elevator: \n Manufacturer name: " + manufacturerName +
                "\n Model name: " + modelName + "\n Elevator type: "+ elevatorType+"\n Max Load Weight: "
                + maxLoadWeight + "\n Time of Exploitation: "+ timeOfExploitation + "\n Power Consumption: "
                + powerConsumption + "\n Fire security: " + fireSecurity + "\n";
    }

    public void resetVslues(String mFireSecurity, String mTimeOfExploitation, int mPowerConsumption, String mManufacturerName,
                            String mModelName,String mElevatorType,int mMaxLoadWeight){
        if (fireSecurity != null && timeOfExploitation != null && powerConsumption != 0 && manufacturerName != null &&
                modelName != null && elevatorType != null && maxLoadWeight != 0) {
            numberOfCompleteElevators++;
        }
        fireSecurity=mFireSecurity;
        powerConsumption=mPowerConsumption;
        manufacturerName=mManufacturerName;
        elevatorType=mElevatorType;
        modelName=mModelName;
        maxLoadWeight=mMaxLoadWeight;
        timeOfExploitation=mTimeOfExploitation;
    }

    public static void printStaticField(){
        System.out.println(numberOfCompleteElevators);
    }
    public void printField(){
        System.out.println(numberOfCompleteElevators);

    }

    public void setElevatorType(String elevatorType) {
        this.elevatorType = elevatorType;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public static void setNumberOfCompleteElevators(int numberOfCompleteElevators) {
        Elevator.numberOfCompleteElevators = numberOfCompleteElevators;
    }

    public String getElevatorType() {
        return elevatorType;
    }

    public String getFireSecurity() {
        return fireSecurity;
    }

    public String getModelName() {
        return modelName;
    }

    public static int getNumberOfCompleteElevators() {
        return numberOfCompleteElevators;
    }

    public int getMaxLoadWeight() {
        return maxLoadWeight;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public String getTimeOfExploitation() {
        return timeOfExploitation;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setFireSecurity(String fireSecurity) {
        this.fireSecurity = fireSecurity;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setMaxLoadWeight(int maxLoadWeight) {
        this.maxLoadWeight = maxLoadWeight;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setTimeOfExploitation(String timeOfExploitation) {
        this.timeOfExploitation = timeOfExploitation;
    }
}
