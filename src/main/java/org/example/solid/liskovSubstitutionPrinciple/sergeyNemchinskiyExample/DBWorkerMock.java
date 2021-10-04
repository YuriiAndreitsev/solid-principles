package org.example.solid.liskovSubstitutionPrinciple.sergeyNemchinskiyExample;

public class DBWorkerMock extends DBWorker {
    @Override
    void openConnection() {
        throw new UnsupportedOperationException("Not Implemented");
    }

    @Override
    void fetchData() {
        super.fetchData();
    }

    @Override
    void closeConnection() {
        throw new UnsupportedOperationException("Not Implemented");
    }
}
