package menu.commands.littletasks.nurserycatsmax.families;

import menu.commands.littletasks.nurserycatsmax.Cat;
import menu.commands.littletasks.nurserycatsmax.CatGenerator;
import menu.commands.littletasks.nurserycatsmax.CatShelterSingleton;

import java.util.ArrayList;
import java.util.List;

public class Depps implements FamilyCat {

    public Depps() {
        this.cats = new ArrayList<>();
        fillCats();
    }

    @Override
    public void giveCatsToShelter() {
        if (cats.size() > 0) {
            cats.clear();
            fillCats();
        }
        CatShelterSingleton.getInstance().fillCatsToTheHouse(cats);
    }

    private List<Cat> cats;

    private void fillCats() {
        this.cats.addAll(CatGenerator.getRandomCat());
    }
}

