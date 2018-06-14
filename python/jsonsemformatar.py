
arquivo = open("dados100sf.json", "w")
numero_alunos = 100      # parâmetro que indica a quantidade de alunos
alunos = numero_alunos+1    # parâmetro utilizado

arquivo.write("{")
arquivo.write("\"lista\":{")
arquivo.write("\"aluno\":[")

for i in range(alunos):
    index = i
    ra = " {}".format(726000 + i)
    aluno = "{"\
            "\"nome\":\"Nome Aluno "+str(index)+"\","\
            "\"email\":\"email_aluno{0}@gmail.com\","\
            "\"ra\":{1}".format(i,ra)
    arquivo.write(aluno)
    if i != alunos-1:
        arquivo.write("},")
    else:
        arquivo.write("}")

arquivo.write("]")
arquivo.write("}")
arquivo.write("}")
arquivo.close()