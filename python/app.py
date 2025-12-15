from sign_validator import SignValidator


def run_sign_validator():
    validator = SignValidator()

    cadena1 = "[{()}]"   # VALIDO
    cadena2 = "[{(])}"   # NO VALIDO

    resultado1 = validator.is_valid(cadena1)
    print("Cadena:", cadena1, "es valida?", resultado1)

    resultado2 = validator.is_valid(cadena2)
    print("Cadena:", cadena2, "es valida?", resultado2)


if __name__ == "__main__":
    run_sign_validator()
