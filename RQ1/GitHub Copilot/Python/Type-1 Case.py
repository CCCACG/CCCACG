# Source Code 2-4 00018.py
def save(self, domain_override=""):
    """
    Create the new ``User`` and ``RegistrationProfile``, and
    returns the ``User`` (by calling
    ``RegistrationProfile.objects.create_inactive_user()``).
    
    """
    new_user = RegistrationProfile.objects.create_inactive_user(username=self.cleaned_data['username'],
                                                                password=self.cleaned_data['password1'],
                                                                email=self.cleaned_data['email'],
                                                                domain_override=domain_override,
                                                                )
    return new_user

# Synthesized Code res_00001.py
def save(self, domain_override=""):
    new_user = RegistrationProfile.objects.create_inactive_user(
        username=self.cleaned_data['username'],
        password=self.cleaned_data['password1'],
        email=self.cleaned_data['email'],
        domain_override=domain_override,
    )
    return new_user