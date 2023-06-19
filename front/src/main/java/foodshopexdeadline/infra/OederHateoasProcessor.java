package foodshopexdeadline.infra;

import foodshopexdeadline.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class OederHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Oeder>> {

    @Override
    public EntityModel<Oeder> process(EntityModel<Oeder> model) {
        return model;
    }
}
