package org.acme.graphql;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

@GraphQLApi
public class Gql {

    @Query
    public List<String> strings() {
        throw new RuntimeException("Oh no!!!");
    }

    @Query
    public Uni<List<String>> morestrings() {
        throw new RuntimeException("Oh no!!!");
    }
}
