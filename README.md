
# Testes - JUnit 5

<div align="center">
<img src="https://github.com/tatiramoos/estudos-junit/assets/106891550/559fe3b1-00d9-41cf-8971-ebf1253bf142" width="300px" />
</div>

<p align="center">
Repositório para estudos de teste unitários e de integração.
</p>

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
    
