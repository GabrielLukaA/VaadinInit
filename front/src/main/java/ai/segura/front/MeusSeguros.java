package ai.segura.front;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;

@Route(value = "/meus-seguros", layout = NavBarApp.class)
public class MeusSeguros extends VerticalLayout {

    public MeusSeguros() {
        Grid grid = new Grid(Seguro.class);
        Seguro seguro = new Seguro("nome", "aa", "aa", "aa", "aa");
        ArrayList<Seguro> seguros = new ArrayList<>();
        seguros.add(seguro);
        grid.setItems(seguro);
        grid.getStyle().set("background-color","blue");
        add(new H1("Meus seguros"), grid);

    }

}
