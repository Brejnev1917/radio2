package ru.netology.domane;


public class Radio {

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int numberOfStations = 10;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = 100;
    }


    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = 0;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public void upVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;
    }


    public void downVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume--;
    }


    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = 9;
    }


    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = 0;
    }


    public int getCurrentStation() {
        return currentStation;
    }


    public void upStation() {
        if (currentStation < maxStation) {
            this.currentStation++;
            return;
        }
        this.currentStation = minStation;
    }


    public void downStation() {
        if (currentStation > minStation) {
            this.currentStation--;
            return;
        }
        this.currentStation = maxStation;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }
}

