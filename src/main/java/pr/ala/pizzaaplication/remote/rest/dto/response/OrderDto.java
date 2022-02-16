package pr.ala.pizzaaplication.remote.rest.dto.response;

import pr.ala.pizzaaplication.domain.model.OrderStatusType;
import pr.ala.pizzaaplication.remote.rest.dto.request.PersonOrderDto;

import java.util.List;

public class OrderDto {

    private Integer id;
    private OrderStatusType status;
    private List<OrderStatusDto> pizzas;
    private PersonOrderDto person;

    public OrderDto(Integer id, OrderStatusType status, List<OrderStatusDto> pizzas, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public List<OrderStatusDto> getPizzas() {
        return pizzas;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public void setPizzas(List<OrderStatusDto> pizzas) {
        this.pizzas = pizzas;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}