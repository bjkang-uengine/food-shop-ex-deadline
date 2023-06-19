package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "oeders", path = "oeders")
public interface OederRepository
    extends PagingAndSortingRepository<Oeder, Long> {}
