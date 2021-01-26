package org.person.pojo;

import java.io.Serializable;

/**
 * @author rainbowPerfect/RainbowPerfect
 * @version v1.0
 * @create 2021/1/19/22:46
 */

public class Payment implements Serializable {
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Payment{" + "id=" + id + ", serial='" + serial + '\'' + '}';
    }
}
