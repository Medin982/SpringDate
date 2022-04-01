package exam.model.dto;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class NameDTO {
    @XmlElement
    @Size(min = 4)
    private String name;

    public String getName() {
        return name;
    }
}
