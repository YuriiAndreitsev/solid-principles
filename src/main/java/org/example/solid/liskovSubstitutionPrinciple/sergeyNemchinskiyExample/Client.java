package org.example.solid.liskovSubstitutionPrinciple.sergeyNemchinskiyExample;

public class Client {
    DBWorker dbWorker;

    public void getData() {
        dbWorker.openConnection();
        dbWorker.fetchData();
        dbWorker.closeConnection();
    }

    public void connectAndGetData(DBWorkerMock dbWorkerMock){

        dbWorkerMock.openConnection();
        dbWorkerMock.fetchData();
        dbWorkerMock.closeConnection();
    }

    public static void main(String[] args) {
        new Client().connectAndGetData(new DBWorkerMock());
    }
}
