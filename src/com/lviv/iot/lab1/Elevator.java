package com.lviv.iot.lab1;

public class Elevator {

    private static int numberOfElevators;
    protected String modelName;
    protected String timeOfExploitation;
    private int powerConsumption;
    private String manufacturerName;
    private int maxLoadWeight;
    private String fireSecurity;
    private String elevatorType;


    public Elevator() {
        this(null, 0, 0, null, null, null, null);

    }

    public Elevator(String mFireSecurity, int mMaxLoadWeight, int mPowerConsumption, String mManufacturerName) {
        this(mFireSecurity, mMaxLoadWeight, mPowerConsumption, mManufacturerName, null, null, null);
    }

    public Elevator(String mFireSecurity, int mMaxLoadWeight, int mPowerConsumption, String mManufacturerName,
                    String mModelName, String mElevatorType, String mTimeOfExploitation) {
        fireSecurity = mFireSecurity;
        powerConsumption = mPowerConsumption;
        manufacturerName = mManufacturerName;
        maxLoadWeight = mMaxLoadWeight;
        modelName = mModelName;
        elevatorType = mElevatorType;
        timeOfExploitation = mTimeOfExploitation;
        numberOfElevators++;
    }

    public static void printStaticField() {
        System.out.println(numberOfElevators);
    }

    public static int getNumberOfElevators() {
        return numberOfElevators;
    }

    public static void setNumberOfElevators(int numberOfElevators) {
        Elevator.numberOfElevators = numberOfElevators;
    }

    public String toString() {
        return "Info about this Elevator: \n Manufacturer name: " + manufacturerName +
                "\n Model name: " + modelName + "\n Elevator type: " + elevatorType + "\n Max Load Weight: "
                + maxLoadWeight + "\n Time of Exploitation: " + timeOfExploitation + "\n Power Consumption: "
                + powerConsumption + "\n Fire security: " + fireSecurity + "\n";
    }

    public void resetVslues(String mFireSecurity, String mTimeOfExploitation, int mPowerConsumption, String mManufacturerName,
                            String mModelName, String mElevatorType, int mMaxLoadWeight) {
        if (fireSecurity != null && timeOfExploitation != null && powerConsumption != 0 && manufacturerName != null &&
                modelName != null && elevatorType != null && maxLoadWeight != 0) {
            numberOfElevators++;
        }
        fireSecurity = mFireSecurity;
        powerConsumption = mPowerConsumption;
        manufacturerName = mManufacturerName;
        elevatorType = mElevatorType;
        modelName = mModelName;
        maxLoadWeight = mMaxLoadWeight;
        timeOfExploitation = mTimeOfExploitation;
    }

    public void printField() {
        System.out.println(numberOfElevators);

    }

    public String getElevatorType() {
        return elevatorType;
    }

    public void setElevatorType(String elevatorType) {
        this.elevatorType = elevatorType;
    }

    public String getFireSecurity() {
        return fireSecurity;
    }

    public void setFireSecurity(String fireSecurity) {
        this.fireSecurity = fireSecurity;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMaxLoadWeight() {
        return maxLoadWeight;
    }

    public void setMaxLoadWeight(int maxLoadWeight) {
        this.maxLoadWeight = maxLoadWeight;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getTimeOfExploitation() {
        return timeOfExploitation;
    }

    public void setTimeOfExploitation(String timeOfExploitation) {
        this.timeOfExploitation = timeOfExploitation;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
}
