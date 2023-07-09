import service.*;

public class Main {
    public static void main(String[] args) {
        MenuService menu = new MenuService();

        while (true)
            menu.entryOptions(menu.entryMenu());
    }
}