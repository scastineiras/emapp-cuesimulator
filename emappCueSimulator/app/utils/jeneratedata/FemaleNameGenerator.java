package utils.jeneratedata;


/**
 * Generates random female names. The list of names was taken from the top 200
 * most common names in the United Stated by the 2000 census. 
 * 
 * @author Agustin Barto <abarto@gmail.com> 
 */
public class FemaleNameGenerator implements Generator<String> {
	/**
	 * Array of the most common female names in the United States.
	 */
	private String[] names = new String[] { "Mariela", "Patricia", "Roberta",
			"Barbara", "Elizabeth", "Jennifer", "Maria", "Susan", "Margaret",
			"Dorothy", "Lisa", "Nancy", "Karen", "Laura", "Helen", "Sandra",
			"Donna", "Carol", "Ruth", "Sharon", "Michelle", "Laura", "Sarah",
			"Kimberly", "Deborah", "Jessica", "Juana", "Mirta", "Angela",
			"Melissa", "Brenda", "Amy", "Anna", "Rebecca", "Virginia",
			"Kathleen", "Pamela", "Martha", "Debra", "Amanda", "Stephanie",
			"Carolyn", "Dana", "Mariana", "Janet", "Catherine", "Frances",
			"Ann", "Joyce", "Diane", "Alice", "Julie", "Heather", "Teresa",
			"Doris", "Gloria", "Evelyn", "Jean", "Cheryl", "Mildred",
			"Katherine", "Joan", "Ashley", "Judith", "Rose", "Janice", "Kelly",
			"Nicole", "Judy", "Christina", "Kathy", "Theresa", "Beverly",
			"Denise", "Tammy", "Irene", "Jane", "Lori", "Rachel", "Marilyn",
			"Andrea", "Kathryn", "Louise", "Sara", "Anne", "Jacqueline",
			"Wanda", "Bonnie", "Julia", "Ruby", "Lois", "Tina", "Phyllis",
			"Norma", "Paula", "Diana", "Annie", "Lillian", "Emily", "Robin",
			"Peggy", "Crystal", "Gladys", "Rita", "Dawn", "Connie", "Florence",
			"Tracy", "Edna", "Tiffany", "Carmen", "Rosa", "Cindy", "Grace",
			"Wendy", "Victoria", "Edith", "Kim", "Sherry", "Sylvia",
			"Josephine", "Thelma", "Shannon", "Sheila", "Ethel", "Ellen",
			"Elaine", "Marjorie", "Carrie", "Charlotte", "Monica", "Esther",
			"Pauline", "Emma", "Juanita", "Anita", "Rhonda", "Hazel", "Amber",
			"Eva", "Debbie", "April", "Leslie", "Clara", "Lucille", "Jamie",
			"Joanne", "Eleanor", "Valerie", "Danielle", "Megan", "Alicia",
			"Suzanne", "Michele", "Gail", "Bertha", "Darlene", "Veronica",
			"Jill", "Erin", "Geraldine", "Lauren", "Cathy", "Joann",
			"Lorraine", "Lynn", "Sally", "Regina", "Erica", "Beatrice",
			"Dolores", "Bernice", "Audrey", "Yvonne", "Annette", "June",
			"Samantha", "Marion", "Dana", "Stacy", "Ana", "Renee", "Ida",
			"Vivian", "Roberta", "Holly", "Brittany", "Melanie", "Loretta",
			"Yolanda", "Jeanette", "Laurie", "Katie", "Kristen", "Vanessa",
			"Alma", "Sue", "Elsie", "Beth", "Jeanne", "Vicki", "Carla", "Tara",
			"Rosemary", "Eileen", "Terri", "Gertrude", "Lucy", "Tonya", "Ella",
			"Stacey", "Wilma", "Gina", "Kristin", "Jessie", "Natalie", "Agnes",
			"Vera", "Willie", "Charlene", "Bessie", "Delores", "Melinda",
			"Pearl", "Arlene", "Maureen", "Colleen", "Allison", "Tamara",
			"Joy", "Georgia", "Constance", "Lillie", "Claudia", "Jackie",
			"Marcia", "Tanya", "Nellie", "Minnie", "Marlene", "Heidi",
			"Glenda", "Lydia", "Viola", "Courtney", "Marian", "Stella",
			"Caroline", "Dora", "Jimena" };
	/**
	 * {@link RandomSequenceArrayBasedGenerator} used to pick the names from the
	 * contained array.
	 */
	private Generator<String> generator = new RandomSequenceArrayBasedGenerator<String>(
			names);

	/* (non-Javadoc)
	 * @see com.googlecode.jeneratedata.core.Generator#generate()
	 */
	@Override
	public String generate() {
		return generator.generate();
	}
}
