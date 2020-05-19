package rs.ac.uns.ftn.backend.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import rs.ac.uns.ftn.backend.model.enumeration.IngredientType;

@Entity
@Table(name="ingredients")
public class Ingredient {
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;
    
    @Column(name = "ingredient_type", nullable = false)
    private IngredientType ingredientType;
    
    @Column(name = "price", nullable = false)
    private double price;
    
    @Column(name = "quantity", nullable = false)
    private double quantity;
    
    @Column(name = "calories", nullable = false)
    private double calories;
    
    @Column(name = "total_price")
    private Double total_price;
    
    @Column(name = "total_calories")
    private Double total_calories;
    
	
	

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JsonBackReference("sastojci")
    private Recipe recipe;


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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public IngredientType getIngredientType() {
		return ingredientType;
	}


	public void setIngredientType(IngredientType ingredientType) {
		this.ingredientType = ingredientType;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getQuantity() {
		return quantity;
	}


	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}


	public double getCalories() {
		return calories;
	}


	public void setCalories(double calories) {
		this.calories = calories;
	}


	public Recipe getRecipe() {
		return recipe;
	}


	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
    
	public Ingredient() {
	
	}


	public Ingredient(Long id, String name, String description, IngredientType ingredientType, double price,
			double quantity, double calories, double total_price, double total_calories, Recipe recipe) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.ingredientType = ingredientType;
		this.price = price;
		this.quantity = quantity;
		this.calories = calories;
		this.total_price = total_price;
		this.total_calories = total_calories;
		this.recipe = recipe;
	}


	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", description=" + description + ", ingredientType="
				+ ingredientType + ", price=" + price + ", quantity=" + quantity + ", calories=" + calories
				+ ", total_price=" + total_price + ", total_calories=" + total_calories + ", recipe=" + recipe + "]";
	}


	public Double getTotal_price() {
		return total_price;
	}


	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}


	public Double getTotal_calories() {
		return total_calories;
	}


	public void setTotal_calories(Double total_calories) {
		this.total_calories = total_calories;
	}
	
	
	
	
    

}
