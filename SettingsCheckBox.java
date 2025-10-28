class SettingsCheckBox extends CheckBox {
    public void enableNotifications() {
        System.out.println("Notifications have been enabled.");
    }

    public void disableNotifications() {
        System.out.println("Notifications have been disabled.");
    }

    public static void main(String[] args) {
        CheckBox cb = new SettingsCheckBox();
        cb.select();
        cb.deselect();

        SettingsCheckBox scb = (SettingsCheckBox) cb;
        scb.enableNotifications();
        scb.disableNotifications();

        System.out.println(scb instanceof SettingsCheckBox);
	}
}