package ai.segura.front;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.apache.coyote.http11.Http11InputBuffer;

import com.vaadin.flow.component.html.H1;

@Route(value = "/meus-automoveis", layout = NavBarApp.class)
public class MeusAutomoveis extends VerticalLayout {

    public MeusAutomoveis(){
        H1 title = new H1("Meus automóveis, bem vindo");
        add(
                title
        );
    }
}
