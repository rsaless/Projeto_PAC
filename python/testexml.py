
arquivo = open("dados10000.xml", "w")
numero_alunos = 10000       # parâmetro que indica a quantidade de alunos
alunos = numero_alunos+1    # parâmetro utilizado

arquivo.write("<lista>\n")

for i in range(alunos):
    ra = 726000 + i
    aluno = "  <aluno>\n"\
            "      <nome>Nome Aluno {}</nome>\n"\
            "      <email>email_aluno{}@gmail.com</email>\n"\
            "      <ra>{}</ra>\n"\
            "  </aluno>\n".format(i,i,ra)
    arquivo.write(aluno)

arquivo.write("</lista>")
arquivo.close()