package pr.ala.pizzaaplication.remote.rest.dto.request;

import pr.ala.pizzaaplication.domain.model.SizeType;

import java.math.BigDecimal;
import java.util.List;

public class AddPizzaDto {

    private String name;
    private List<AddSizeDto> size;

    public AddPizzaDto() {
    }

    public AddPizzaDto(String name, List<AddSizeDto> size, BigDecimal price) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public List<AddSizeDto> getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(List<AddSizeDto> size) {
        this.size = size;
    }

}
