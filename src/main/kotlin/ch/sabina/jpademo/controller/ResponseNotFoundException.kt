package ch.sabina.jpademo.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class ResourceNotFoundException( modelName: String,
                                 fieldName: String,
                                 fieldValue: Any) :
        RuntimeException(String.format("%s not found with %s : '%s'",
                modelName, fieldName, fieldValue))