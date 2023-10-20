
# Testes - JUnit 5

![novidades-do-junit-5-parte-1](https://github.com/tatiramoos/estudo-junit/assets/106891550/a03ec347-e09a-4f7a-b0f3-39d86b82eba8)


Repositório para estudos de teste unitários e de integração.


## Links Importantes

- [Documentação JUnit 5](https://junit.org/junit5/docs/current/user-guide/)


## Assertivas mais comuns usadas em projetos:


```bash
  @Test
  public void assertivas() {

  Assertions.assertEquals("Casa", "Casa");
  Assertions.assertNotEquals("Casa", "casa");
  Assertions.assertTrue("casa".equalsIgnoreCase("CASA"));
  Assertions.assertTrue("Casa".endsWith("sa"));
  Assertions.assertTrue("Casa".startsWith("Ca"));
  
  List<String> s1 = new ArrayList<>();
  List<String> s2 = new ArrayList<>();
  List<String> s3 = null;

  Assertions.assertEquals(s1, s2);
  Assertions.assertSame(s1, s1);
  Assertions.assertNotEquals(s1, s3);
  Assertions.assertNull(s3);
  Assertions.assertNotNull(s1);
  Assertions.fail("Falhou pelo motivo A");
  }
```
    