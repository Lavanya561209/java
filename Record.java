class Record {
    public Record() {
        this(2024);
        System.out.println("Record has been saved successfully.");
    }

    public Record(int year) {
        this("Employee Data", 45.6f);
        System.out.println("The record belongs to the year: " + year);
    }

    public Record(String recordType, float fileSize) {
        System.out.println("Record type: " + recordType + "File size: " + fileSize + " MB");
    }
}

