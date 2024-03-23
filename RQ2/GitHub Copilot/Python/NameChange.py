# Convert the name of function to upper camel case.

# Source Code
def validate_class_type_arguments(operator):
    """
    Decorator to validate all the arguments to function
    are of the type of calling class for passed operator
    """


    def inner(function):
        def wrapper(self, *args, **kwargs):
            for arg in args + tuple(kwargs.values()):
                if not isinstance(arg, self.__class__):
                    raise TypeError(
                        "unorderable types: {}() {} {}()".format(
                            type(self).__name__, operator, type(arg).__name__
                        )
                    )
            return function(self, *args, **kwargs)
        return wrapper
    return inner

# Generated Code by Copilot
def ValidateClassTypeArguments(operator):
    """
    Decorator to validate all the arguments to function
    are of the type of calling class for passed operator
    """
    def decorator(func):
        @wraps(func)
        def wrapper(self, *args, **kwargs):
            for arg in args:
                if not isinstance(arg, self.__class__):
                    raise TypeError("Argument %s is not of type %s" % (arg, self.__class__))
            return func(self, *args, **kwargs)
        return wrapper
    return decorator