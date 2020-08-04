# grails-trait-inheritanceм

```
startup failed:
/home/demon/r/grails-trait-inheritance/grails-app/domain/traittest/Contract.groovy: 3: The type ContractDraft is not a valid substitute for the bounded parameter <D extends traittest.ApprovalDraft>
 @ line 3, column 27.
   class Contract implements ApprovalTarget<ContractDraft>{

```

#Groovy code

```
for (int i = 0; i < nTypes.length; i++) {
            ClassNode nType = nTypes[i].getType();
            ClassNode cnType = cnTypes[i].getType();
            // check nested type parameters
            checkGenericsUsage(nType, nType.redirect());
            // check bounds
            if (!nType.isDerivedFrom(cnType)) {
                if (cnType.isInterface() && nType.implementsInterface(cnType)) continue;
                addError("The type " + nTypes[i].getName() +
                        " is not a valid substitute for the bounded parameter <" +
                        getPrintName(cnTypes[i]) + ">", n);
            }
        }
```
