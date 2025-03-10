package org.moldavets.model;

abstract public class AbstractDevice {
    protected Long id;
    protected String name;
    protected boolean isWorked;

    public AbstractDevice(Long id, String name, boolean isWorked) {
        this.id = id;
        this.name = name;
        this.isWorked = isWorked;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWorked() {
        return isWorked;
    }

    public void setWorked(boolean worked) {
        isWorked = worked;
    }

    public abstract void switchPower();

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isWorked=" + isWorked +
                '}';
    }

}
