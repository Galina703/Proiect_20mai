package pixel.academy.spring._core_ioc;


import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Prepare pasta al podoro with fresh tomatoes and basil!";
    }
}
