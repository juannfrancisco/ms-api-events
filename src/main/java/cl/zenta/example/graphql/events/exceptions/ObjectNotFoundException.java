package cl.zenta.example.graphql.events.exceptions;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectNotFoundException extends RuntimeException implements GraphQLError {

    private Map<String, Object> extensions = new HashMap<>();

    public ObjectNotFoundException(String message, Integer idInvalidObject) {
        super(message);
        extensions.put("idInvalidObject", idInvalidObject);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }
}
