class SignValidator:

    def is_valid(self, text: str) -> bool:
        stack = []

        for character in text:
            if character == '(' or character == '{' or character == '[':
                stack.append(character)

            elif character == ')' or character == '}' or character == ']':
                if not stack:
                    return False

                ultimo = stack.pop()
                if not self.is_tipo_igual(ultimo, character):
                    return False

        return len(stack) == 0

    def is_tipo_igual(self, apertura, cierre):
        if apertura == '(' and cierre == ')':
            return True
        if apertura == '{' and cierre == '}':
            return True
        if apertura == '[' and cierre == ']':
            return True
        return False
